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

public val Icons.Outline.CupTogo: ImageVector
    get() {
        if (_cupTogo != null) {
            return _cupTogo!!
        }
        _cupTogo = Builder(name = "CupTogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.999f, 5.0f)
                horizontalLineToRelative(-1.282f)
                lineToRelative(-0.548f, -2.616f)
                curveToRelative(-0.29f, -1.381f, -1.524f, -2.384f, -2.936f, -2.384f)
                lineTo(5.767f, 0.0f)
                curveToRelative(-1.412f, 0.0f, -2.646f, 1.003f, -2.937f, 2.385f)
                lineToRelative(-0.547f, 2.615f)
                lineTo(0.999f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.205f)
                lineToRelative(1.67f, 14.347f)
                curveToRelative(0.176f, 1.513f, 1.457f, 2.653f, 2.979f, 2.653f)
                horizontalLineToRelative(10.291f)
                curveToRelative(1.523f, 0.0f, 2.804f, -1.141f, 2.979f, -2.653f)
                lineToRelative(1.67f, -14.347f)
                horizontalLineToRelative(1.205f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.788f, 2.795f)
                curveToRelative(0.097f, -0.461f, 0.508f, -0.795f, 0.979f, -0.795f)
                horizontalLineToRelative(12.466f)
                curveToRelative(0.471f, 0.0f, 0.882f, 0.334f, 0.979f, 0.795f)
                lineToRelative(0.462f, 2.205f)
                lineTo(4.326f, 5.0f)
                lineToRelative(0.462f, -2.205f)
                close()
                moveTo(4.8f, 12.0f)
                horizontalLineToRelative(14.399f)
                lineToRelative(-0.582f, 5.0f)
                lineTo(5.382f, 17.0f)
                lineToRelative(-0.582f, -5.0f)
                close()
                moveTo(17.145f, 22.0f)
                lineTo(6.854f, 22.0f)
                curveToRelative(-0.507f, 0.0f, -0.935f, -0.38f, -0.993f, -0.884f)
                lineToRelative(-0.246f, -2.116f)
                horizontalLineToRelative(12.769f)
                lineToRelative(-0.246f, 2.116f)
                curveToRelative(-0.059f, 0.504f, -0.486f, 0.884f, -0.993f, 0.884f)
                close()
                moveTo(19.432f, 10.0f)
                lineTo(4.567f, 10.0f)
                lineToRelative(-0.349f, -3.0f)
                horizontalLineToRelative(15.563f)
                lineToRelative(-0.349f, 3.0f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
