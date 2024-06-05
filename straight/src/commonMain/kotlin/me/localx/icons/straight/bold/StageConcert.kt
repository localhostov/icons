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

public val Icons.Bold.StageConcert: ImageVector
    get() {
        if (_stageConcert != null) {
            return _stageConcert!!
        }
        _stageConcert = Builder(name = "StageConcert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.008f, 4.103f)
                lineTo(13.507f, 0.042f)
                curveToRelative(-0.958f, -0.455f, -2.057f, -0.456f, -3.016f, 0.0f)
                lineTo(1.992f, 4.103f)
                curveToRelative(-1.21f, 0.578f, -1.992f, 1.817f, -1.992f, 3.158f)
                verticalLineToRelative(16.739f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.337f)
                lineToRelative(-0.753f, 2.0f)
                horizontalLineToRelative(12.831f)
                lineToRelative(-0.753f, -2.0f)
                horizontalLineToRelative(3.337f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(23.999f, 7.261f)
                curveToRelative(0.0f, -1.341f, -0.782f, -2.58f, -1.992f, -3.158f)
                close()
                moveTo(11.783f, 2.751f)
                curveToRelative(0.136f, -0.066f, 0.294f, -0.066f, 0.432f, 0.0f)
                lineToRelative(4.711f, 2.25f)
                lineTo(7.074f, 5.001f)
                lineToRelative(4.71f, -2.249f)
                close()
                moveTo(12.999f, 19.0f)
                verticalLineToRelative(-5.279f)
                lineToRelative(1.937f, -1.55f)
                lineToRelative(-1.874f, -2.342f)
                lineToRelative(-3.063f, 2.45f)
                verticalLineToRelative(6.721f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _stageConcert!!
    }

private var _stageConcert: ImageVector? = null
