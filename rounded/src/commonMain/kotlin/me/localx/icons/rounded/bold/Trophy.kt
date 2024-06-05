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

public val Icons.Bold.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.393f, -3.657f)
                curveToRelative(0.072f, -0.21f, 0.151f, -0.421f, 0.213f, -0.63f)
                arcToRelative(4.385f, 4.385f, 0.0f, false, false, -0.705f, -3.9f)
                arcTo(4.473f, 4.473f, 0.0f, false, false, 17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                arcTo(4.473f, 4.473f, 0.0f, false, false, 2.885f, 1.813f)
                arcToRelative(4.383f, 4.383f, 0.0f, false, false, -0.7f, 3.9f)
                curveToRelative(0.062f, 0.209f, 0.141f, 0.42f, 0.213f, 0.63f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 3.15f, 2.379f, 6.8f, 9.0f, 6.983f)
                lineTo(9.0f, 19.5f)
                arcTo(1.373f, 1.373f, 0.0f, false, true, 7.5f, 21.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-0.982f)
                arcTo(1.378f, 1.378f, 0.0f, false, true, 15.0f, 19.5f)
                lineTo(15.0f, 16.983f)
                curveTo(21.621f, 16.8f, 24.0f, 13.15f, 24.0f, 10.0f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(0.0f, 1.587f, -1.154f, 3.26f, -4.214f, 3.811f)
                arcToRelative(17.731f, 17.731f, 0.0f, false, false, 3.62f, -4.721f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 10.0f)
                close()
                moveTo(5.288f, 3.609f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.212f, 0.609f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.231f, 1.253f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -4.337f, 6.883f)
                arcTo(6.488f, 6.488f, 0.0f, false, false, 12.0f, 16.92f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.494f, 6.494f, 0.0f, false, false, -2.606f, -5.177f)
                arcTo(15.587f, 15.587f, 0.0f, false, true, 5.057f, 4.861f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 5.288f, 3.609f)
                close()
                moveTo(3.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.594f, -0.91f)
                arcToRelative(17.718f, 17.718f, 0.0f, false, false, 3.621f, 4.721f)
                curveTo(4.154f, 13.261f, 3.0f, 11.587f, 3.0f, 10.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
