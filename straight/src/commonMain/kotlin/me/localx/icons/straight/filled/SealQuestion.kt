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

public val Icons.Filled.SealQuestion: ImageVector
    get() {
        if (_sealQuestion != null) {
            return _sealQuestion!!
        }
        _sealQuestion = Builder(name = "SealQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 8.479f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.979f)
                lineTo(12.0f, -0.021f)
                lineToRelative(-3.521f, 3.521f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.979f)
                lineTo(-0.021f, 12.0f)
                lineToRelative(3.521f, 3.521f)
                verticalLineToRelative(4.979f)
                horizontalLineToRelative(4.979f)
                lineToRelative(3.521f, 3.521f)
                lineToRelative(3.521f, -3.521f)
                horizontalLineToRelative(4.979f)
                verticalLineToRelative(-4.979f)
                lineToRelative(3.521f, -3.521f)
                lineToRelative(-3.521f, -3.521f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.447f, 12.629f)
                curveToRelative(-0.188f, 0.103f, -0.447f, 0.563f, -0.447f, 0.876f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.0f, -1.033f, 0.637f, -2.163f, 1.481f, -2.628f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.057f, -0.602f, 0.021f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.68f, -0.572f, 1.578f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                close()
            }
        }
        .build()
        return _sealQuestion!!
    }

private var _sealQuestion: ImageVector? = null
