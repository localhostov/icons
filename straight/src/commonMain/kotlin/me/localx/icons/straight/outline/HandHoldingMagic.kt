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

public val Icons.Outline.HandHoldingMagic: ImageVector
    get() {
        if (_handHoldingMagic != null) {
            return _handHoldingMagic!!
        }
        _handHoldingMagic = Builder(name = "HandHoldingMagic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 4.5f)
                curveToRelative(-0.024f, -1.627f, 1.023f, -3.326f, 3.011f, -3.942f)
                curveToRelative(3.371f, -1.493f, 8.988f, 0.206f, 8.988f, 4.442f)
                curveToRelative(0.0f, 3.0f, -2.309f, 4.798f, -4.549f, 5.0f)
                curveToRelative(1.517f, -0.89f, 2.549f, -2.38f, 2.549f, -4.0f)
                curveToRelative(0.0f, -2.0f, -2.047f, -2.961f, -3.5f, -2.992f)
                curveToRelative(-1.212f, -0.025f, -3.5f, -0.008f, -3.5f, 1.992f)
                curveToRelative(0.0f, 0.842f, 0.906f, 1.5f, 2.0f, 1.5f)
                curveToRelative(1.0f, 0.0f, 2.068f, -0.398f, 2.451f, -1.5f)
                curveToRelative(0.143f, 0.589f, -0.451f, 3.027f, -3.451f, 3.027f)
                reflectiveCurveToRelative(-3.976f, -1.991f, -4.0f, -3.527f)
                close()
                moveTo(23.235f, 13.015f)
                lineToRelative(-9.787f, 10.985f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.857f)
                curveToRelative(1.139f, 0.0f, 2.139f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.217f, -3.534f)
                curveToRelative(0.54f, -0.595f, 1.281f, -0.944f, 2.085f, -0.981f)
                curveToRelative(0.812f, -0.039f, 1.574f, 0.24f, 2.169f, 0.782f)
                curveToRelative(1.214f, 1.107f, 1.312f, 3.005f, 0.218f, 4.23f)
                close()
                moveTo(21.67f, 10.263f)
                curveToRelative(-0.199f, -0.181f, -0.457f, -0.267f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.129f, -0.699f, 0.329f)
                lineToRelative(-4.427f, 4.864f)
                curveToRelative(-0.385f, 1.071f, -1.339f, 1.891f, -2.514f, 2.059f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.559f, -0.08f, 0.98f, -0.566f, 0.98f, -1.131f)
                curveToRelative(0.0f, -0.63f, -0.513f, -1.142f, -1.143f, -1.142f)
                lineTo(3.0f, 13.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.552f)
                lineToRelative(9.19f, -10.316f)
                curveToRelative(0.368f, -0.412f, 0.335f, -1.049f, -0.072f, -1.421f)
                close()
            }
        }
        .build()
        return _handHoldingMagic!!
    }

private var _handHoldingMagic: ImageVector? = null
