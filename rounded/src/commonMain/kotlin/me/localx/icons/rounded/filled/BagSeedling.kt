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

public val Icons.Filled.BagSeedling: ImageVector
    get() {
        if (_bagSeedling != null) {
            return _bagSeedling!!
        }
        _bagSeedling = Builder(name = "BagSeedling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.237f, 2.921f)
                curveToRelative(-0.323f, -0.611f, -0.311f, -1.327f, 0.039f, -1.929f)
                curveToRelative(0.36f, -0.621f, 1.004f, -0.992f, 1.723f, -0.992f)
                horizontalLineToRelative(18.002f)
                curveToRelative(0.719f, 0.0f, 1.362f, 0.371f, 1.723f, 0.992f)
                curveToRelative(0.35f, 0.602f, 0.362f, 1.318f, 0.039f, 1.929f)
                lineToRelative(-0.034f, 0.079f)
                lineTo(1.271f, 3.0f)
                lineToRelative(-0.034f, -0.079f)
                close()
                moveTo(22.725f, 21.0f)
                lineTo(1.275f, 21.0f)
                lineToRelative(-0.045f, 0.106f)
                curveToRelative(-0.321f, 0.612f, -0.307f, 1.328f, 0.043f, 1.929f)
                curveToRelative(0.361f, 0.619f, 1.004f, 0.989f, 1.721f, 0.989f)
                horizontalLineToRelative(18.014f)
                curveToRelative(0.717f, 0.0f, 1.359f, -0.37f, 1.721f, -0.989f)
                curveToRelative(0.35f, -0.601f, 0.364f, -1.317f, 0.043f, -1.929f)
                lineToRelative(-0.045f, -0.106f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(14.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(16.876f, 8.011f)
                curveToRelative(-3.513f, 0.527f, -4.546f, 3.456f, -4.874f, 4.981f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                reflectiveCurveToRelative(-0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-0.325f, -1.528f, -1.385f, -4.453f, -4.874f, -4.981f)
                curveToRelative(-0.632f, -0.096f, -1.196f, 0.465f, -1.117f, 1.099f)
                curveToRelative(0.478f, 3.81f, 3.416f, 4.661f, 4.994f, 4.842f)
                curveToRelative(0.0f, 0.013f, -0.001f, 0.027f, -0.001f, 0.041f)
                verticalLineToRelative(1.008f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.008f)
                curveToRelative(0.0f, -0.015f, 0.0f, -0.03f, -0.001f, -0.046f)
                curveToRelative(1.571f, -0.179f, 4.496f, -1.028f, 4.993f, -4.832f)
                curveToRelative(0.083f, -0.635f, -0.482f, -1.198f, -1.116f, -1.103f)
                close()
            }
        }
        .build()
        return _bagSeedling!!
    }

private var _bagSeedling: ImageVector? = null
