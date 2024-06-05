package me.localx.icons.straight.bold

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

public val Icons.Bold.CaravanAlt: ImageVector
    get() {
        if (_caravanAlt != null) {
            return _caravanAlt!!
        }
        _caravanAlt = Builder(name = "CaravanAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 7.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.0f, 20.5f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                lineTo(0.0f, 19.885f)
                lineTo(2.0f, 19.885f)
                arcToRelative(5.454f, 5.454f, 0.0f, false, true, 1.0f, -2.673f)
                lineTo(3.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(19.0f, 17.0f)
                lineTo(11.743f, 17.0f)
                arcToRelative(5.484f, 5.484f, 0.0f, false, true, 1.232f, 3.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 17.0f)
                close()
            }
        }
        .build()
        return _caravanAlt!!
    }

private var _caravanAlt: ImageVector? = null
