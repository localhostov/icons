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

public val Icons.Bold.SnowBlowing: ImageVector
    get() {
        if (_snowBlowing != null) {
            return _snowBlowing!!
        }
        _snowBlowing = Builder(name = "SnowBlowing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.042f, 15.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                curveToRelative(-1.782f, 0.076f, -5.266f, -1.659f, -3.513f, -3.681f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.119f, 0.094f)
                curveToRelative(0.919f, 1.028f, 2.9f, 0.634f, 2.893f, -0.913f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(14.5f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.042f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 24.042f, 15.5f)
                close()
                moveTo(15.5f, 9.0f)
                horizontalLineToRelative(4.042f)
                curveToRelative(5.933f, -0.156f, 5.932f, -8.845f, 0.0f, -9.0f)
                curveToRelative(-1.782f, -0.076f, -5.265f, 1.66f, -3.512f, 3.681f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.119f, -0.094f)
                curveToRelative(0.919f, -1.028f, 2.9f, -0.634f, 2.893f, 0.913f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(15.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 9.0f)
                close()
                moveTo(9.5f, 15.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 19.5f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -2.883f, 0.851f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.323f, 1.9f)
                curveTo(8.379f, 25.559f, 14.057f, 23.81f, 14.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.5f, 15.0f)
                close()
                moveTo(0.861f, 9.733f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.047f, 0.555f)
                lineTo(5.0f, 9.089f)
                lineTo(5.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(8.0f, 9.089f)
                lineToRelative(2.092f, 1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.492f, -2.6f)
                lineTo(9.515f, 6.5f)
                lineToRelative(2.069f, -1.187f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.492f, -2.6f)
                lineTo(8.0f, 3.911f)
                lineTo(8.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(5.0f, 3.911f)
                lineToRelative(-2.092f, -1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.492f, 2.6f)
                lineTo(3.485f, 6.5f)
                lineTo(1.416f, 7.687f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.861f, 9.733f)
                close()
            }
        }
        .build()
        return _snowBlowing!!
    }

private var _snowBlowing: ImageVector? = null
