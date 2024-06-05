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
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-0.283f)
                lineToRelative(-0.381f, -1.82f)
                curveToRelative(-0.386f, -1.842f, -2.033f, -3.18f, -3.916f, -3.18f)
                lineTo(6.58f, -0.0f)
                curveToRelative(-1.882f, 0.0f, -3.529f, 1.337f, -3.915f, 3.18f)
                lineToRelative(-0.381f, 1.82f)
                horizontalLineToRelative(-0.283f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.204f)
                lineToRelative(1.464f, 12.578f)
                curveToRelative(0.293f, 2.521f, 2.429f, 4.422f, 4.966f, 4.422f)
                horizontalLineToRelative(6.729f)
                curveToRelative(2.538f, 0.0f, 4.673f, -1.901f, 4.966f, -4.422f)
                lineToRelative(1.464f, -12.578f)
                horizontalLineToRelative(0.206f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.8f, 12.0f)
                horizontalLineToRelative(14.399f)
                lineToRelative(-0.582f, 5.0f)
                lineTo(5.382f, 17.0f)
                lineToRelative(-0.582f, -5.0f)
                close()
                moveTo(6.58f, 2.0f)
                horizontalLineToRelative(10.841f)
                curveToRelative(0.941f, 0.0f, 1.765f, 0.668f, 1.958f, 1.59f)
                lineToRelative(0.295f, 1.41f)
                lineTo(4.326f, 5.0f)
                lineToRelative(0.295f, -1.41f)
                curveToRelative(0.193f, -0.921f, 1.017f, -1.59f, 1.958f, -1.59f)
                close()
                moveTo(19.781f, 7.0f)
                lineToRelative(-0.349f, 3.0f)
                lineTo(4.567f, 10.0f)
                lineToRelative(-0.349f, -3.0f)
                horizontalLineToRelative(15.563f)
                close()
                moveTo(15.364f, 22.0f)
                horizontalLineToRelative(-6.729f)
                curveToRelative(-1.522f, 0.0f, -2.804f, -1.141f, -2.98f, -2.653f)
                lineToRelative(-0.04f, -0.347f)
                horizontalLineToRelative(12.77f)
                lineToRelative(-0.04f, 0.347f)
                curveToRelative(-0.176f, 1.513f, -1.458f, 2.653f, -2.98f, 2.653f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
