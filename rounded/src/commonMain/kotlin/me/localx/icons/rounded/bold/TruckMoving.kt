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

public val Icons.Bold.TruckMoving: ImageVector
    get() {
        if (_truckMoving != null) {
            return _truckMoving!!
        }
        _truckMoving = Builder(name = "TruckMoving", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.615f, 10.6f)
                lineToRelative(-0.842f, -2.525f)
                arcTo(4.493f, 4.493f, 0.0f, false, false, 18.5f, 5.0f)
                horizontalLineTo(16.792f)
                arcTo(5.509f, 5.509f, 0.0f, false, false, 11.5f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 6.5f)
                verticalLineTo(20.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(0.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.915f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineTo(12.974f)
                arcTo(7.468f, 7.468f, 0.0f, false, false, 23.615f, 10.6f)
                close()
                moveTo(19.928f, 9.025f)
                lineToRelative(0.841f, 2.526f)
                arcTo(4.493f, 4.493f, 0.0f, false, true, 21.0f, 12.974f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.928f, 9.025f)
                close()
                moveTo(3.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 6.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _truckMoving!!
    }

private var _truckMoving: ImageVector? = null
