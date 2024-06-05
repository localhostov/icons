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

public val Icons.Filled.Risk: ImageVector
    get() {
        if (_risk != null) {
            return _risk!!
        }
        _risk = Builder(name = "Risk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.707f, 13.454f)
                lineToRelative(3.224f, 1.812f)
                lineToRelative(-2.941f, 5.23f)
                lineToRelative(-3.188f, -1.794f)
                curveToRelative(-0.823f, 0.73f, -1.773f, 1.303f, -2.801f, 1.688f)
                verticalLineToRelative(3.608f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-1.094f, -0.364f, -2.107f, -0.938f, -2.988f, -1.691f)
                lineToRelative(-3.001f, 1.688f)
                lineTo(0.07f, 15.267f)
                lineToRelative(2.944f, -1.655f)
                curveToRelative(-0.099f, -0.536f, -0.148f, -1.082f, -0.148f, -1.631f)
                curveToRelative(0.0f, -0.536f, 0.048f, -1.07f, 0.142f, -1.596f)
                lineTo(0.07f, 8.733f)
                lineTo(3.011f, 3.504f)
                lineToRelative(2.975f, 1.672f)
                curveToRelative(0.886f, -0.764f, 1.909f, -1.346f, 3.015f, -1.715f)
                lineTo(9.001f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.57f)
                curveToRelative(1.039f, 0.39f, 1.997f, 0.97f, 2.827f, 1.711f)
                lineToRelative(3.162f, -1.777f)
                lineToRelative(2.941f, 5.229f)
                lineToRelative(-3.218f, 1.811f)
                curveToRelative(0.077f, 0.475f, 0.115f, 0.955f, 0.115f, 1.438f)
                curveToRelative(0.0f, 0.495f, -0.041f, 0.988f, -0.121f, 1.474f)
                close()
                moveTo(18.0f, 16.0f)
                lineToRelative(-6.0f, -10.286f)
                lineToRelative(-6.0f, 10.286f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _risk!!
    }

private var _risk: ImageVector? = null
