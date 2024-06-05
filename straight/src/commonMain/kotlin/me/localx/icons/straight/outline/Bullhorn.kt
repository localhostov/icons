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

public val Icons.Outline.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.5f)
                curveToRelative(0.0f, -1.209f, -0.859f, -2.218f, -2.0f, -2.45f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.729f, -3.878f, 4.0f, -6.5f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.485f, 1.085f, 2.721f, 2.503f, 2.958f)
                lineToRelative(3.297f, 9.042f)
                horizontalLineToRelative(2.448f)
                curveToRelative(0.935f, 0.0f, 1.796f, -0.468f, 2.307f, -1.252f)
                curveToRelative(0.509f, -0.784f, 0.586f, -1.762f, 0.229f, -2.562f)
                lineToRelative(-1.946f, -5.187f)
                horizontalLineToRelative(4.662f)
                curveToRelative(2.622f, 0.0f, 6.5f, 1.271f, 6.5f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                close()
                moveTo(2.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(8.934f, 20.943f)
                curveToRelative(0.104f, 0.234f, 0.083f, 0.501f, -0.056f, 0.715f)
                curveToRelative(-0.139f, 0.214f, -0.375f, 0.342f, -0.629f, 0.342f)
                horizontalLineToRelative(-1.049f)
                lineToRelative(-2.552f, -7.0f)
                horizontalLineToRelative(2.055f)
                lineToRelative(2.231f, 5.943f)
                close()
                moveTo(13.5f, 13.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.402f, 0.0f, 4.852f, -0.742f, 6.5f, -2.086f)
                verticalLineToRelative(11.173f)
                curveToRelative(-1.648f, -1.344f, -4.098f, -2.086f, -6.5f, -2.086f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
