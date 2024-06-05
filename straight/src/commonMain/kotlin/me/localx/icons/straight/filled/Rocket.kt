package me.localx.icons.straight.filled

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

public val Icons.Filled.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.352f, 0.648f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, -2.31f, -0.514f)
                lineToRelative(-0.216f, 0.077f)
                arcTo(32.5f, 32.5f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(36.107f, 36.107f, 0.0f, false, false, -4.7f, 6.645f)
                lineTo(5.586f, 17.0f)
                lineTo(3.0f, 19.586f)
                lineTo(4.414f, 21.0f)
                lineTo(7.0f, 18.414f)
                lineToRelative(2.32f, 2.32f)
                arcToRelative(36.149f, 36.149f, 0.0f, false, false, 6.644f, -4.7f)
                arcTo(32.74f, 32.74f, 0.0f, false, false, 23.791f, 3.169f)
                lineToRelative(0.075f, -0.211f)
                arcTo(2.189f, 2.189f, 0.0f, false, false, 23.352f, 0.648f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 14.0f)
                close()
                moveTo(14.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.0f)
                close()
                moveTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 8.0f)
                close()
                moveTo(18.947f, 15.762f)
                arcTo(11.416f, 11.416f, 0.0f, false, true, 14.429f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 22.078f)
                arcToRelative(34.925f, 34.925f, 0.0f, false, false, 6.379f, -4.629f)
                curveTo(17.93f, 16.9f, 18.447f, 16.334f, 18.947f, 15.762f)
                close()
                moveTo(6.551f, 6.568f)
                arcToRelative(34.925f, 34.925f, 0.0f, false, false, -4.629f, 6.379f)
                lineTo(0.0f, 12.947f)
                lineTo(0.0f, 9.518f)
                arcTo(11.416f, 11.416f, 0.0f, false, true, 8.238f, 5.0f)
                curveTo(7.666f, 5.5f, 7.1f, 6.017f, 6.551f, 6.568f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
