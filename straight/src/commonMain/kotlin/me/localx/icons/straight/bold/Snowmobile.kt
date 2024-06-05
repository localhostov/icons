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

public val Icons.Bold.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 24.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.572f, -4.928f)
                lineTo(0.0f, 15.0f)
                horizontalLineTo(3.192f)
                lineToRelative(1.661f, 3.38f)
                lineToRelative(1.952f, -3.167f)
                lineTo(3.884f, 13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.37f, 8.83f)
                lineToRelative(0.1f, -0.174f)
                lineToRelative(1.24f, -1.822f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.354f, 5.37f)
                curveToRelative(0.67f, 0.335f, 4.657f, 2.861f, 5.45f, 3.364f)
                lineTo(12.2f, 11.267f)
                curveToRelative(-1.28f, -0.813f, -2.642f, -1.668f, -3.661f, -2.3f)
                lineTo(6.677f, 11.661f)
                lineToRelative(2.034f, 1.2f)
                arcToRelative(2.417f, 2.417f, 0.0f, false, true, 1.173f, 1.435f)
                arcTo(2.475f, 2.475f, 0.0f, false, true, 9.7f, 16.223f)
                lineTo(7.993f, 19.0f)
                horizontalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 21.5f)
                close()
                moveTo(9.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 7.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 5.0f)
                close()
                moveTo(20.842f, 17.343f)
                lineTo(24.0f, 14.111f)
                verticalLineTo(10.405f)
                lineTo(14.529f, 2.829f)
                lineTo(12.655f, 5.172f)
                lineToRelative(2.482f, 1.985f)
                horizontalLineToRelative(0.0f)
                arcTo(3.873f, 3.873f, 0.0f, false, true, 16.5f, 8.936f)
                curveToRelative(0.0f, 1.369f, -0.832f, 2.064f, -2.473f, 2.064f)
                verticalLineToRelative(3.0f)
                curveToRelative(2.682f, 0.0f, 4.619f, -1.379f, 5.241f, -3.538f)
                lineTo(21.0f, 11.847f)
                verticalLineToRelative(1.042f)
                lineToRelative(-2.3f, 2.358f)
                arcTo(2.511f, 2.511f, 0.0f, false, true, 16.908f, 16.0f)
                horizontalLineTo(12.143f)
                lineToRelative(-1.734f, 3.0f)
                horizontalLineToRelative(4.664f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 24.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 21.0f)
                horizontalLineToRelative(-0.073f)
                lineToRelative(-1.105f, -2.211f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 20.842f, 17.343f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null
