package me.localx.icons.straight.filled

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

public val Icons.Filled.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.78f, 20.187f)
                curveToRelative(0.357f, 0.799f, 0.28f, 1.777f, -0.229f, 2.562f)
                curveToRelative(-0.51f, 0.784f, -1.372f, 1.252f, -2.307f, 1.252f)
                horizontalLineToRelative(-1.444f)
                lineToRelative(-2.553f, -7.0f)
                horizontalLineToRelative(5.337f)
                lineToRelative(1.195f, 3.187f)
                close()
                moveTo(7.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(22.0f, 7.05f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.729f, -3.878f, 4.0f, -6.5f, 4.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.622f, 0.0f, 6.5f, 1.271f, 6.5f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                reflectiveCurveToRelative(-0.859f, -2.218f, -2.0f, -2.45f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
