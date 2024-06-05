package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.TemperatureFrigid: ImageVector
    get() {
        if (_temperatureFrigid != null) {
            return _temperatureFrigid!!
        }
        _temperatureFrigid = Builder(name = "TemperatureFrigid", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.111f)
                verticalLineTo(5.0f)
                curveToRelative(-0.211f, -6.609f, -9.791f, -6.6f, -10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                curveTo(7.666f, 16.363f, 10.922f, 24.117f, 17.0f, 24.0f)
                curveTo(23.077f, 24.117f, 26.335f, 16.362f, 22.0f, 12.111f)
                close()
                moveTo(17.0f, 20.0f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -1.0f, -5.828f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.172f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 17.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.41f, 2.764f)
                arcToRelative(2.036f, 2.036f, 0.0f, false, true, -0.42f, 0.323f)
                lineTo(9.0f, 12.854f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.934f, 14.916f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.52f, 13.5f)
                lineToRelative(1.056f, -1.056f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 12.12f)
                verticalLineTo(11.034f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, true, -1.841f, -0.865f)
                lineToRelative(-0.96f, 0.557f)
                arcToRelative(2.038f, 2.038f, 0.0f, false, true, -0.066f, 0.528f)
                lineTo(3.75f, 12.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.934f, -0.512f)
                lineTo(2.2f, 10.744f)
                lineToRelative(-1.455f, -0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.512f, -1.933f)
                lineTo(2.7f, 8.794f)
                arcToRelative(2.022f, 2.022f, 0.0f, false, true, 0.492f, 0.2f)
                lineToRelative(0.923f, -0.536f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, true, 0.009f, -1.82f)
                lineTo(3.193f, 6.1f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, true, -0.491f, 0.2f)
                lineToRelative(-1.446f, 0.382f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 0.744f, 4.751f)
                lineTo(2.189f, 4.37f)
                lineTo(1.816f, 2.908f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.75f, 2.4f)
                lineToRelative(0.383f, 1.445f)
                arcTo(1.972f, 1.972f, 0.0f, false, true, 4.2f, 4.37f)
                lineToRelative(0.988f, 0.575f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 7.0f, 4.106f)
                lineToRelative(0.0f, -1.015f)
                arcToRelative(2.068f, 2.068f, 0.0f, false, true, -0.428f, -0.327f)
                lineTo(5.506f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.92f, 0.293f)
                lineTo(7.977f, 1.35f)
                lineTo(9.053f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _temperatureFrigid!!
    }

private var _temperatureFrigid: ImageVector? = null
