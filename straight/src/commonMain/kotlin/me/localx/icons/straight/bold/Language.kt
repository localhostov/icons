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

public val Icons.Bold.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.065f, 9.463f)
                lineToRelative(0.787f, 3.437f)
                horizontalLineToRelative(-1.757f)
                lineToRelative(0.811f, -3.437f)
                curveToRelative(0.009f, -0.037f, 0.041f, -0.063f, 0.079f, -0.063f)
                reflectiveCurveToRelative(0.071f, 0.026f, 0.079f, 0.063f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(14.5f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(9.0f, 16.0f)
                lineToRelative(-1.559f, -6.804f)
                curveToRelative(-0.107f, -0.464f, -0.403f, -0.886f, -0.842f, -1.07f)
                curveToRelative(-0.919f, -0.385f, -1.855f, 0.155f, -2.056f, 1.021f)
                lineToRelative(-1.616f, 6.853f)
                horizontalLineToRelative(1.437f)
                lineToRelative(0.401f, -1.7f)
                horizontalLineToRelative(2.409f)
                lineToRelative(0.389f, 1.7f)
                horizontalLineToRelative(1.437f)
                close()
                moveTo(21.0f, 6.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.0f)
                lineTo(21.0f, 6.5f)
                close()
                moveTo(17.127f, 8.0f)
                horizontalLineToRelative(-1.253f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.873f)
                verticalLineToRelative(1.253f)
                horizontalLineToRelative(4.808f)
                curveToRelative(-0.111f, 0.963f, -0.484f, 2.151f, -1.303f, 3.071f)
                curveToRelative(-0.36f, -0.405f, -0.644f, -0.857f, -0.847f, -1.325f)
                horizontalLineToRelative(-1.336f)
                curveToRelative(0.265f, 0.751f, 0.668f, 1.487f, 1.223f, 2.123f)
                curveToRelative(-0.664f, 0.403f, -1.495f, 0.661f, -2.545f, 0.661f)
                verticalLineToRelative(1.253f)
                curveToRelative(1.462f, 0.0f, 2.615f, -0.413f, 3.512f, -1.053f)
                curveToRelative(0.894f, 0.636f, 2.033f, 1.053f, 3.488f, 1.053f)
                verticalLineToRelative(-1.253f)
                curveToRelative(-1.049f, 0.0f, -1.876f, -0.262f, -2.539f, -0.665f)
                curveToRelative(0.99f, -1.135f, 1.485f, -2.591f, 1.607f, -3.866f)
                horizontalLineToRelative(0.932f)
                verticalLineToRelative(-1.253f)
                horizontalLineToRelative(-2.873f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
