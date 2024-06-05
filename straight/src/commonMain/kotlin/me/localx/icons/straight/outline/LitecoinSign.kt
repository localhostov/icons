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

public val Icons.Outline.LitecoinSign: ImageVector
    get() {
        if (_litecoinSign != null) {
            return _litecoinSign!!
        }
        _litecoinSign = Builder(name = "LitecoinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-7.89f)
                lineTo(0.0f, 14.44f)
                verticalLineToRelative(-2.11f)
                lineToRelative(4.0f, -1.33f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.33f)
                lineToRelative(10.0f, -3.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-10.0f, 3.33f)
                verticalLineToRelative(8.56f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        .build()
        return _litecoinSign!!
    }

private var _litecoinSign: ImageVector? = null
