package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.FlyingDisc: ImageVector
    get() {
        if (_flyingDisc != null) {
            return _flyingDisc!!
        }
        _flyingDisc = Builder(name = "FlyingDisc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.952f, 2.048f)
                curveTo(20.666f, 0.761f, 18.912f, 0.08f, 16.877f, 0.016f)
                curveToRelative(-0.039f, -0.005f, -1.839f, 0.056f, -2.764f, 0.257f)
                curveToRelative(-3.057f, 0.661f, -6.175f, 2.458f, -8.778f, 5.062f)
                curveTo(-0.152f, 10.823f, -1.627f, 18.277f, 2.048f, 21.952f)
                curveToRelative(1.352f, 1.352f, 3.213f, 2.051f, 5.381f, 2.051f)
                curveToRelative(0.782f, 0.0f, 1.605f, -0.091f, 2.458f, -0.276f)
                curveToRelative(3.057f, -0.661f, 6.175f, -2.458f, 8.778f, -5.062f)
                curveToRelative(5.487f, -5.488f, 6.962f, -12.942f, 3.287f, -16.617f)
                close()
                moveTo(6.749f, 6.749f)
                curveToRelative(2.336f, -2.335f, 5.101f, -3.941f, 7.787f, -4.522f)
                curveToRelative(0.683f, -0.148f, 1.336f, -0.22f, 1.954f, -0.225f)
                curveToRelative(0.204f, 0.122f, 0.395f, 0.259f, 0.559f, 0.423f)
                curveToRelative(0.975f, 0.975f, 1.212f, 2.629f, 0.669f, 4.659f)
                curveToRelative(-0.595f, 2.222f, -2.035f, 4.559f, -4.055f, 6.579f)
                curveToRelative(-3.964f, 3.964f, -9.108f, 5.514f, -11.239f, 3.385f)
                curveToRelative(-0.17f, -0.169f, -0.309f, -0.368f, -0.433f, -0.579f)
                curveToRelative(0.023f, -2.996f, 1.705f, -6.666f, 4.758f, -9.72f)
                close()
                moveTo(17.251f, 17.251f)
                curveToRelative(-2.336f, 2.335f, -5.101f, 3.941f, -7.787f, 4.522f)
                curveToRelative(-2.529f, 0.545f, -4.66f, 0.107f, -6.002f, -1.235f)
                curveToRelative(-0.287f, -0.287f, -0.519f, -0.615f, -0.721f, -0.962f)
                curveToRelative(0.72f, 0.283f, 1.516f, 0.43f, 2.373f, 0.43f)
                curveToRelative(3.043f, 0.0f, 6.776f, -1.743f, 9.963f, -4.93f)
                curveToRelative(2.265f, -2.264f, 3.889f, -4.919f, 4.572f, -7.476f)
                curveToRelative(0.496f, -1.851f, 0.454f, -3.508f, -0.075f, -4.857f)
                curveToRelative(0.351f, 0.202f, 0.68f, 0.433f, 0.964f, 0.717f)
                curveToRelative(2.895f, 2.896f, 1.42f, 9.081f, -3.287f, 13.789f)
                close()
            }
        }
        .build()
        return _flyingDisc!!
    }

private var _flyingDisc: ImageVector? = null
