package me.localx.icons.rounded.filled

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

public val Icons.Filled.HatSanta: ImageVector
    get() {
        if (_hatSanta != null) {
            return _hatSanta!!
        }
        _hatSanta = Builder(name = "HatSanta", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.998f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineToRelative(-17.999f, 0.002f)
                curveToRelative(-1.657f, 0.0f, -3.001f, -1.343f, -3.001f, -3.0f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 1.998f)
                curveToRelative(-0.18f, 0.0f, -0.353f, 0.023f, -0.524f, 0.053f)
                curveTo(19.289f, 1.019f, 17.525f, -0.002f, 15.143f, -0.002f)
                curveTo(11.116f, -0.002f, 4.323f, 4.393f, 2.297f, 15.998f)
                horizontalLineToRelative(19.337f)
                curveToRelative(-0.408f, -2.334f, -1.016f, -4.359f, -1.747f, -6.133f)
                curveToRelative(-2.221f, -0.509f, -3.887f, -2.492f, -3.887f, -4.865f)
                curveToRelative(0.0f, -0.647f, 0.122f, -1.278f, 0.364f, -1.875f)
                curveToRelative(0.207f, -0.512f, 0.79f, -0.758f, 1.302f, -0.552f)
                curveToRelative(0.512f, 0.207f, 0.759f, 0.79f, 0.552f, 1.302f)
                curveToRelative(-0.145f, 0.357f, -0.218f, 0.736f, -0.218f, 1.125f)
                curveToRelative(0.0f, 1.424f, 0.999f, 2.613f, 2.331f, 2.919f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.216f, 0.049f, 0.438f, 0.081f, 0.669f, 0.081f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _hatSanta!!
    }

private var _hatSanta: ImageVector? = null
