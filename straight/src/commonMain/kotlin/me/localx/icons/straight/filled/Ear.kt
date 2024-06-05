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

public val Icons.Filled.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.829f, 2.415f)
                curveTo(16.815f, 0.616f, 14.112f, -0.245f, 11.403f, 0.062f)
                curveTo(7.174f, 0.537f, 3.68f, 3.938f, 3.095f, 8.149f)
                curveToRelative(-0.226f, 1.623f, 0.03f, 3.246f, 0.541f, 4.767f)
                curveToRelative(0.364f, 1.084f, 0.364f, 2.084f, 0.417f, 4.408f)
                curveToRelative(0.049f, 2.161f, 0.639f, 4.205f, 2.385f, 5.506f)
                curveToRelative(1.038f, 0.773f, 2.304f, 1.163f, 3.569f, 1.163f)
                curveToRelative(1.159f, 0.0f, 2.318f, -0.327f, 3.302f, -0.986f)
                curveToRelative(0.891f, -0.595f, 1.604f, -1.405f, 2.062f, -2.34f)
                curveToRelative(0.796f, -1.626f, 1.633f, -2.714f, 2.631f, -3.425f)
                curveToRelative(2.504f, -1.78f, 3.999f, -4.674f, 3.999f, -7.742f)
                curveToRelative(0.0f, -2.701f, -1.156f, -5.284f, -3.171f, -7.085f)
                close()
                moveTo(16.0f, 9.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.761f, 0.0f, -3.222f, 1.306f, -3.465f, 3.0f)
                curveToRelative(1.639f, 0.02f, 2.965f, 1.358f, 2.965f, 3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.033f, 2.468f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.467f, 5.5f, 5.5f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
