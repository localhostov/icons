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

public val Icons.Bold.CloudsSun: ImageVector
    get() {
        if (_cloudsSun != null) {
            return _cloudsSun!!
        }
        _cloudsSun = Builder(name = "CloudsSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.63f, 13.574f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 7.006f, 15.255f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(8.25f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 0.88f, -10.426f)
                close()
                moveTo(16.75f, 21.0f)
                horizontalLineTo(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 4.958f, -0.312f)
                lineToRelative(0.166f, 1.312f)
                horizontalLineTo(16.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.792f, 7.0f)
                curveToRelative(-0.005f, -0.016f, -0.012f, -0.031f, -0.017f, -0.048f)
                arcTo(5.483f, 5.483f, 0.0f, false, false, 20.3f, 5.823f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(2.27f, -2.269f)
                lineTo(20.45f, 1.429f)
                lineTo(18.18f, 3.7f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.128f, -0.472f)
                lineTo(17.0f, 3.208f)
                verticalLineTo(0.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.212f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.179f, 0.487f)
                lineTo(10.55f, 1.429f)
                lineTo(8.429f, 3.551f)
                lineTo(10.144f, 5.2f)
                arcTo(7.554f, 7.554f, 0.0f, false, true, 14.705f, 8.35f)
                arcToRelative(7.545f, 7.545f, 0.0f, false, true, 4.335f, 3.519f)
                curveToRelative(0.2f, 0.067f, 0.39f, 0.162f, 0.584f, 0.245f)
                arcTo(5.49f, 5.49f, 0.0f, false, false, 20.788f, 10.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.5f)
                arcToRelative(6.514f, 6.514f, 0.0f, false, true, 3.166f, -5.579f)
                arcTo(7.478f, 7.478f, 0.0f, false, true, 11.7f, 8.047f)
                arcTo(5.431f, 5.431f, 0.0f, false, false, 8.5f, 7.0f)
                arcToRelative(5.505f, 5.505f, 0.0f, false, false, -5.494f, 5.255f)
                arcToRelative(4.493f, 4.493f, 0.0f, false, false, -0.957f, 8.01f)
                arcTo(6.438f, 6.438f, 0.0f, false, true, 2.0f, 19.5f)
                close()
            }
        }
        .build()
        return _cloudsSun!!
    }

private var _cloudsSun: ImageVector? = null
