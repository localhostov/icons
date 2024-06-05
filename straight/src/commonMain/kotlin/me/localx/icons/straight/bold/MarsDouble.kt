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

public val Icons.Bold.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(17.0f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-2.534f, 2.535f)
                arcTo(6.447f, 6.447f, 0.0f, false, false, 13.5f, 11.0f)
                curveToRelative(-0.18f, 0.0f, -0.356f, 0.017f, -0.532f, 0.032f)
                curveToRelative(0.014f, -0.176f, 0.032f, -0.352f, 0.032f, -0.532f)
                arcToRelative(6.447f, 6.447f, 0.0f, false, false, -0.974f, -3.4f)
                lineToRelative(2.535f, -2.534f)
                lineTo(17.0f, 7.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(10.0f)
                lineToRelative(2.439f, 2.439f)
                lineTo(9.9f, 4.974f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 6.5f, 17.0f)
                curveToRelative(0.178f, 0.0f, 0.352f, -0.018f, 0.526f, -0.032f)
                curveTo(7.011f, 17.143f, 7.0f, 17.32f, 7.0f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 12.026f, -3.4f)
                lineToRelative(2.535f, -2.534f)
                close()
                moveTo(3.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 6.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 10.5f)
                close()
                moveTo(13.5f, 21.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 17.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 21.0f)
                close()
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null
