package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.138f, 5.276f, 7.863f, 5.272f, 8.0f, 0.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 18.0f)
                close()
                moveTo(2.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 10.0f)
                close()
                moveTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 22.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, -3.444f, 2.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(20.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 17.382f)
                arcTo(3.974f, 3.974f, 0.0f, false, false, 8.0f, 16.0f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
