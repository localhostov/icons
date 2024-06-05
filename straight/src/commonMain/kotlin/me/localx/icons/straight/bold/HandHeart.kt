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

public val Icons.Bold.HandHeart: ImageVector
    get() {
        if (_handHeart != null) {
            return _handHeart!!
        }
        _handHeart = Builder(name = "HandHeart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 24.0f)
                lineTo(8.918f, 24.0f)
                lineToRelative(-3.667f, -3.351f)
                lineTo(0.747f, 16.609f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(2.64f, 2.296f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.248f, 0.812f, 1.248f, 1.56f)
                lineTo(8.987f, 19.999f)
                lineToRelative(1.095f, 1.001f)
                horizontalLineToRelative(10.918f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(11.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 1.5f)
                close()
                moveTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(16.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 1.5f)
                close()
                moveTo(11.006f, 15.16f)
                curveToRelative(0.0f, 2.262f, 4.0f, 5.04f, 4.0f, 5.04f)
                curveToRelative(0.0f, 0.0f, 4.0f, -2.778f, 4.0f, -5.04f)
                curveToRelative(0.0f, -1.193f, -0.895f, -2.16f, -2.0f, -2.16f)
                reflectiveCurveToRelative(-2.0f, 0.771f, -2.0f, 1.964f)
                curveToRelative(0.0f, -1.193f, -0.895f, -1.964f, -2.0f, -1.964f)
                reflectiveCurveToRelative(-2.0f, 0.967f, -2.0f, 2.16f)
                close()
            }
        }
        .build()
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
