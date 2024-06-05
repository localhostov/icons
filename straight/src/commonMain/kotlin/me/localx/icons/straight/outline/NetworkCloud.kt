package me.localx.icons.straight.outline

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

public val Icons.Outline.NetworkCloud: ImageVector
    get() {
        if (_networkCloud != null) {
            return _networkCloud!!
        }
        _networkCloud = Builder(name = "NetworkCloud", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.0f)
                lineTo(14.816f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 18.184f)
                lineTo(13.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.787f, -9.938f)
                arcTo(5.488f, 5.488f, 0.0f, false, false, 6.0f, 5.5f)
                arcToRelative(5.147f, 5.147f, 0.0f, false, false, 0.038f, 0.617f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.184f, 20.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.184f, 22.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(5.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.037f, 8.007f)
                horizontalLineToRelative(0.015f)
                lineToRelative(1.713f, 0.171f)
                lineToRelative(-0.54f, -1.491f)
                arcTo(3.429f, 3.429f, 0.0f, false, true, 8.0f, 5.5f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, true, 6.956f, -0.385f)
                lineToRelative(0.1f, 0.89f)
                lineToRelative(1.005f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _networkCloud!!
    }

private var _networkCloud: ImageVector? = null
