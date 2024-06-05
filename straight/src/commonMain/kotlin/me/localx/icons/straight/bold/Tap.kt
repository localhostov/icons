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

public val Icons.Bold.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 15.841f)
                verticalLineToRelative(8.198f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.881f)
                lineToRelative(-9.0f, -2.347f)
                verticalLineToRelative(8.229f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-5.266f, -4.391f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(2.64f, 2.222f)
                lineTo(6.987f, 6.5f)
                curveToRelative(0.0f, -0.911f, 0.799f, -1.632f, 1.739f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.273f, 0.812f, 1.273f, 1.56f)
                verticalLineToRelative(6.13f)
                lineToRelative(12.0f, 3.131f)
                close()
                moveTo(5.0f, 11.929f)
                verticalLineToRelative(-5.468f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.468f)
                curveToRelative(1.801f, -1.157f, 3.0f, -3.173f, 3.0f, -5.468f)
                curveTo(15.0f, 2.876f, 12.084f, -0.04f, 8.5f, -0.04f)
                reflectiveCurveTo(2.0f, 2.876f, 2.0f, 6.46f)
                curveToRelative(0.0f, 2.295f, 1.199f, 4.312f, 3.0f, 5.468f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
