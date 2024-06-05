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

public val Icons.Bold.OilTemp: ImageVector
    get() {
        if (_oilTemp != null) {
            return _oilTemp!!
        }
        _oilTemp = Builder(name = "OilTemp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, -3.708f)
                lineTo(10.5f, 0.0f)
                lineTo(17.0f, 0.0f)
                lineTo(17.0f, 3.0f)
                lineTo(13.5f, 3.0f)
                lineTo(13.5f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 8.0f)
                lineTo(13.5f, 8.0f)
                verticalLineToRelative(2.292f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 8.0f, 14.0f)
                close()
                moveTo(22.592f, 14.0f)
                lineTo(19.408f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.0f)
                curveToRelative(-0.031f, 0.0f, -0.058f, -0.012f, -0.088f, -0.014f)
                arcToRelative(5.975f, 5.975f, 0.0f, false, true, -1.252f, 2.786f)
                arcTo(4.345f, 4.345f, 0.0f, false, false, 18.0f, 18.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 18.0f)
                lineTo(24.0f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 14.0f)
                close()
                moveTo(6.0f, 18.0f)
                arcToRelative(4.345f, 4.345f, 0.0f, false, false, 1.34f, -0.228f)
                arcToRelative(5.975f, 5.975f, 0.0f, false, true, -1.252f, -2.786f)
                curveToRelative(-0.03f, 0.0f, -0.057f, 0.014f, -0.088f, 0.014f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.408f, -1.0f)
                lineTo(1.408f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 6.0f, 18.0f)
                close()
                moveTo(22.592f, 20.0f)
                lineTo(19.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(13.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(7.408f, 20.0f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                lineTo(1.408f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(24.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 20.0f)
                close()
            }
        }
        .build()
        return _oilTemp!!
    }

private var _oilTemp: ImageVector? = null
