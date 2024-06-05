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

public val Icons.Bold.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 17.5f)
                close()
                moveTo(13.092f, 14.0f)
                lineTo(10.908f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 13.5f)
                lineTo(8.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.908f, 0.5f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
                moveTo(10.431f, 15.947f)
                lineTo(9.506f, 16.888f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.139f, 2.095f)
                reflectiveCurveToRelative(0.163f, 0.187f, 0.189f, 0.211f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, false, 3.9f, -0.007f)
                lineToRelative(1.116f, -1.134f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.138f, -2.106f)
                close()
                moveTo(22.0f, 7.157f)
                lineTo(22.0f, 18.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 16.5f, 24.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 2.0f, 18.5f)
                lineTo(2.0f, 5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 7.5f, 0.0f)
                horizontalLineToRelative(7.343f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 3.889f, 1.611f)
                lineToRelative(1.657f, 1.657f)
                arcTo(5.464f, 5.464f, 0.0f, false, true, 22.0f, 7.157f)
                close()
                moveTo(18.985f, 7.0f)
                lineTo(17.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(15.0f, 3.015f)
                curveTo(14.947f, 3.012f, 7.5f, 3.0f, 7.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 21.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 18.5f)
                reflectiveCurveTo(18.988f, 7.053f, 18.985f, 7.0f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
