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

public val Icons.Bold.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.842f, 14.542f)
                arcTo(6.827f, 6.827f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -5.848f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.2f, 13.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 14.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.792f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.842f, 14.542f)
                close()
                moveTo(13.0f, 9.667f)
                curveTo(13.0f, 11.0f, 14.119f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(18.0f, 11.0f, 18.0f, 9.667f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 15.5f, 7.0f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 13.0f, 9.667f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.547f, 0.081f, 3.451f, 12.0f, 3.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(11.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 8.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 9.5f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
