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

public val Icons.Bold.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.286f, 14.463f)
                lineToRelative(-5.197f, -9.984f)
                curveToRelative(-1.471f, -2.826f, -4.731f, -4.149f, -7.721f, -3.199f)
                curveToRelative(-1.082f, -0.804f, -2.42f, -1.28f, -3.868f, -1.28f)
                curveTo(2.916f, 0.0f, 0.0f, 2.916f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(2.279f, 0.0f, 4.287f, -1.179f, 5.448f, -2.959f)
                curveToRelative(0.819f, 1.276f, 2.046f, 2.217f, 3.509f, 2.678f)
                curveToRelative(0.645f, 0.203f, 1.304f, 0.304f, 1.961f, 0.304f)
                curveToRelative(1.032f, 0.0f, 2.159f, -0.303f, 3.103f, -0.794f)
                curveToRelative(3.179f, -1.655f, 4.42f, -5.587f, 2.765f, -8.767f)
                close()
                moveTo(10.0f, 17.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 10.5f)
                lineTo(3.0f, 10.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(12.492f, 3.981f)
                curveToRelative(1.209f, 0.057f, 2.342f, 0.742f, 2.936f, 1.883f)
                lineToRelative(1.869f, 3.591f)
                lineToRelative(-4.298f, 2.357f)
                verticalLineToRelative(-5.312f)
                curveToRelative(0.0f, -0.893f, -0.181f, -1.744f, -0.508f, -2.519f)
                close()
                moveTo(20.859f, 18.517f)
                curveToRelative(-0.281f, 0.892f, -0.893f, 1.62f, -1.727f, 2.054f)
                curveToRelative(-0.829f, 0.432f, -1.879f, 0.568f, -2.772f, 0.288f)
                curveToRelative(-0.892f, -0.281f, -1.62f, -0.893f, -2.052f, -1.722f)
                lineToRelative(-1.308f, -2.512f)
                verticalLineToRelative(-1.39f)
                lineToRelative(5.683f, -3.117f)
                lineToRelative(1.942f, 3.731f)
                curveToRelative(0.432f, 0.83f, 0.515f, 1.777f, 0.233f, 2.669f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
