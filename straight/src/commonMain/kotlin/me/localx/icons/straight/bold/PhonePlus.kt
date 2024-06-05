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

public val Icons.Bold.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) {
            return _phonePlus!!
        }
        _phonePlus = Builder(name = "PhonePlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.295f, 14.864f)
                curveToRelative(-2.328f, -1.097f, -4.042f, -2.818f, -5.206f, -5.227f)
                lineToRelative(2.963f, -2.963f)
                lineTo(5.41f, 0.033f)
                lineTo(1.766f, 3.677f)
                curveToRelative(-1.139f, 1.137f, -1.766f, 2.672f, -1.766f, 4.323f)
                curveToRelative(0.0f, 7.152f, 8.791f, 15.942f, 15.942f, 15.942f)
                curveToRelative(1.65f, 0.0f, 3.186f, -0.627f, 4.322f, -1.765f)
                lineToRelative(3.646f, -3.646f)
                lineToRelative(-6.642f, -6.641f)
                lineToRelative(-2.974f, 2.973f)
                close()
                moveTo(18.143f, 20.057f)
                curveToRelative(-0.57f, 0.571f, -1.352f, 0.885f, -2.2f, 0.885f)
                curveToRelative(-4.993f, 0.0f, -12.942f, -7.067f, -12.942f, -12.942f)
                curveToRelative(0.0f, -0.849f, 0.314f, -1.63f, 0.886f, -2.201f)
                lineToRelative(1.524f, -1.524f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-2.268f, 2.268f)
                lineToRelative(0.369f, 0.919f)
                curveToRelative(1.589f, 3.96f, 4.347f, 6.712f, 8.194f, 8.181f)
                lineToRelative(0.908f, 0.347f)
                lineToRelative(2.255f, -2.255f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-1.525f, 1.525f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
