package me.localx.icons.rounded.bold

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

public val Icons.Bold.Choose: ImageVector
    get() {
        if (_choose != null) {
            return _choose!!
        }
        _choose = Builder(name = "Choose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.121f, 0.0f, 0.0f, 1.121f, 0.0f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 15.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.113f, -0.716f, -2.075f, -1.781f, -2.395f)
                lineToRelative(-4.219f, -1.266f)
                verticalLineToRelative(2.737f)
                curveToRelative(0.0f, 1.338f, -1.085f, 2.423f, -2.423f, 2.423f)
                horizontalLineToRelative(-0.762f)
                curveToRelative(-0.884f, 0.0f, -1.738f, -0.323f, -2.4f, -0.908f)
                lineToRelative(-1.68f, -1.483f)
                curveToRelative(-0.866f, -0.722f, -0.983f, -2.008f, -0.261f, -2.874f)
                curveToRelative(0.722f, -0.866f, 2.008f, -0.983f, 2.874f, -0.261f)
                lineToRelative(1.64f, 1.296f)
                verticalLineToRelative(-8.269f)
                curveToRelative(0.0f, -0.958f, 0.883f, -1.705f, 1.884f, -1.449f)
                curveToRelative(0.682f, 0.175f, 1.129f, 0.839f, 1.129f, 1.543f)
                verticalLineToRelative(4.115f)
                lineToRelative(5.08f, 1.524f)
                curveToRelative(2.345f, 0.702f, 3.92f, 2.819f, 3.92f, 5.268f)
                close()
            }
        }
        .build()
        return _choose!!
    }

private var _choose: ImageVector? = null
