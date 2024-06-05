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

public val Icons.Filled.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.265f, 22.0f)
                lineToRelative(3.9f, -2.484f)
                lineToRelative(-1.074f, -1.687f)
                lineToRelative(6.747f, -4.3f)
                lineToRelative(1.074f, 1.687f)
                lineToRelative(4.218f, -2.686f)
                lineToRelative(-1.074f, -1.687f)
                lineToRelative(1.687f, -1.075f)
                lineTo(21.915f, 6.9f)
                arcToRelative(12.018f, 12.018f, 0.0f, false, false, -1.644f, -2.032f)
                lineTo(2.211f, 16.37f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, 1.146f, 2.349f)
                lineToRelative(1.829f, 2.87f)
                lineToRelative(1.687f, -1.074f)
                lineTo(7.818f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(18.741f, 9.376f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.688f, 1.074f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.741f, 9.376f)
                close()
                moveTo(7.241f, 15.516f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.312f, 17.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.238f, 15.516f)
                close()
                moveTo(1.016f, 8.428f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, true, 1.373f, -2.84f)
                lineTo(10.425f, 0.47f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 13.579f, 0.427f)
                lineToRelative(4.384f, 2.628f)
                curveToRelative(0.24f, 0.144f, 0.463f, 0.312f, 0.692f, 0.473f)
                lineTo(1.678f, 14.339f)
                curveToRelative(-0.048f, -0.275f, -0.106f, -0.549f, -0.135f, -0.827f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
