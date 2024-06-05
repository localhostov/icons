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

public val Icons.Bold.TaxiBus: ImageVector
    get() {
        if (_taxiBus != null) {
            return _taxiBus!!
        }
        _taxiBus = Builder(name = "TaxiBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineToRelative(3.928f)
                lineToRelative(-0.808f, 1.777f)
                curveToRelative(-0.182f, 0.401f, -0.342f, 0.81f, -0.48f, 1.223f)
                horizontalLineToRelative(-2.64f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 4.684f)
                curveToRelative(0.0f, -1.34f, 0.775f, -2.577f, 1.977f, -3.151f)
                curveToRelative(1.456f, -0.699f, 3.771f, -1.532f, 6.523f, -1.532f)
                reflectiveCurveToRelative(5.067f, 0.833f, 6.524f, 1.532f)
                curveToRelative(1.2f, 0.574f, 1.976f, 1.812f, 1.976f, 3.151f)
                verticalLineToRelative(0.63f)
                curveToRelative(-0.438f, -0.196f, -0.917f, -0.313f, -1.422f, -0.313f)
                horizontalLineToRelative(-2.247f)
                curveToRelative(-1.248f, 0.01f, -2.341f, 0.85f, -2.851f, 1.989f)
                lineToRelative(-0.211f, 0.473f)
                curveToRelative(-1.141f, 0.256f, -2.431f, 1.536f, -2.988f, 2.763f)
                lineToRelative(-0.281f, 0.617f)
                lineTo(9.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 17.949f)
                verticalLineToRelative(4.051f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.051f)
                curveToRelative(0.0f, -1.487f, 0.325f, -2.989f, 0.941f, -4.345f)
                lineToRelative(1.16f, -2.553f)
                curveToRelative(0.48f, -1.057f, 1.453f, -1.797f, 2.573f, -1.997f)
                lineToRelative(0.23f, -0.918f)
                curveToRelative(0.167f, -0.669f, 0.766f, -1.137f, 1.455f, -1.137f)
                horizontalLineToRelative(2.219f)
                curveToRelative(0.689f, 0.0f, 1.288f, 0.468f, 1.455f, 1.137f)
                lineToRelative(0.227f, 0.907f)
                curveToRelative(1.147f, 0.183f, 2.148f, 0.931f, 2.638f, 2.008f)
                lineToRelative(1.16f, 2.553f)
                curveToRelative(0.616f, 1.355f, 0.941f, 2.857f, 0.941f, 4.345f)
                close()
                moveTo(20.741f, 16.0f)
                curveToRelative(-0.106f, -0.396f, -0.244f, -0.782f, -0.413f, -1.153f)
                lineToRelative(-1.16f, -2.553f)
                curveToRelative(-0.081f, -0.179f, -0.261f, -0.294f, -0.456f, -0.294f)
                horizontalLineToRelative(-4.424f)
                curveToRelative(-0.195f, 0.0f, -0.375f, 0.115f, -0.456f, 0.294f)
                lineToRelative(-1.16f, 2.553f)
                curveToRelative(-0.169f, 0.371f, -0.306f, 0.758f, -0.413f, 1.153f)
                horizontalLineToRelative(8.482f)
                close()
            }
        }
        .build()
        return _taxiBus!!
    }

private var _taxiBus: ImageVector? = null
