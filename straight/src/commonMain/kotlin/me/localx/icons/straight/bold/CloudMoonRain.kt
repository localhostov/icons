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

public val Icons.Bold.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) {
            return _cloudMoonRain!!
        }
        _cloudMoonRain = Builder(name = "CloudMoonRain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.263f, 13.053f)
                arcToRelative(5.762f, 5.762f, 0.0f, false, false, -11.226f, 1.04f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 23.9f)
                lineTo(8.0f, 20.722f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 14.75f)
                arcTo(2.752f, 2.752f, 0.0f, false, true, 13.75f, 12.0f)
                arcTo(2.723f, 2.723f, 0.0f, false, true, 16.5f, 14.57f)
                lineTo(16.568f, 16.0f)
                lineTo(18.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 18.5f)
                arcToRelative(2.462f, 2.462f, 0.0f, false, true, -1.0f, 1.975f)
                verticalLineToRelative(3.312f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.737f, -10.734f)
                close()
                moveTo(22.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 24.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 9.0f)
                close()
                moveTo(22.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 24.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 0.0f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 20.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(3.756f, 14.379f)
                arcTo(7.917f, 7.917f, 0.0f, false, true, 3.0f, 11.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, true, 1.472f, 0.137f)
                arcTo(10.75f, 10.75f, 0.0f, false, false, 9.266f, 8.443f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 13.1f, 7.054f)
                arcTo(9.559f, 9.559f, 0.0f, false, true, 16.326f, 4.0f)
                lineToRelative(2.313f, -1.32f)
                lineTo(16.311f, 1.383f)
                arcTo(10.978f, 10.978f, 0.0f, false, false, 2.174f, 17.537f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 3.756f, 14.379f)
                close()
            }
        }
        .build()
        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
