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

public val Icons.Bold.CarBus: ImageVector
    get() {
        if (_carBus != null) {
            return _carBus!!
        }
        _carBus = Builder(name = "CarBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.95f)
                arcToRelative(10.428f, 10.428f, 0.0f, false, false, -0.941f, -4.346f)
                lineTo(21.9f, 11.052f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 18.712f, 9.0f)
                horizontalLineTo(14.288f)
                arcTo(3.505f, 3.505f, 0.0f, false, false, 11.1f, 11.052f)
                lineTo(9.941f, 13.6f)
                arcTo(10.428f, 10.428f, 0.0f, false, false, 9.0f, 17.95f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.833f, 12.292f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.288f, 12.0f)
                horizontalLineToRelative(4.424f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.455f, 0.293f)
                lineToRelative(1.161f, 2.553f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 20.743f, 16.0f)
                horizontalLineTo(12.257f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.415f, -1.154f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(8.928f)
                lineTo(8.12f, 12.777f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 7.64f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.684f)
                arcTo(3.51f, 3.51f, 0.0f, false, true, 3.975f, 1.532f)
                arcTo(15.294f, 15.294f, 0.0f, false, true, 10.5f, 0.0f)
                arcToRelative(15.286f, 15.286f, 0.0f, false, true, 6.524f, 1.532f)
                arcTo(3.509f, 3.509f, 0.0f, false, true, 19.0f, 4.684f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -2.719f, 2.723f)
                lineTo(9.0f, 10.842f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _carBus!!
    }

private var _carBus: ImageVector? = null
