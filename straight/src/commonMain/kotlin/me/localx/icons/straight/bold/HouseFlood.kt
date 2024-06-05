package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HouseFlood: ImageVector
    get() {
        if (_houseFlood != null) {
            return _houseFlood!!
        }
        _houseFlood = Builder(name = "HouseFlood", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.592f, 20.0f)
                horizontalLineTo(19.408f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                horizontalLineTo(13.408f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                horizontalLineTo(7.408f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, true, -2.816f, 0.0f)
                horizontalLineTo(1.408f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.468f, 4.468f, 0.0f, false, false, 3.0f, -1.17f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.468f, 4.468f, 0.0f, false, false, 24.0f, 24.0f)
                verticalLineTo(21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.592f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.989f)
                verticalLineTo(12.21f)
                lineToRelative(9.0f, -9.0f)
                lineToRelative(9.0f, 9.0f)
                verticalLineToRelative(5.779f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(10.968f)
                lineTo(13.768f, 0.735f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(0.0f, 10.968f)
                verticalLineToRelative(7.021f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.182f, 13.588f)
                horizontalLineToRelative(-0.364f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 8.0f, 17.406f)
                verticalLineToRelative(0.583f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.583f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 12.182f, 13.588f)
                close()
            }
        }
        .build()
        return _houseFlood!!
    }

private var _houseFlood: ImageVector? = null
