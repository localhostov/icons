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

public val Icons.Bold.TablePivot: ImageVector
    get() {
        if (_tablePivot != null) {
            return _tablePivot!!
        }
        _tablePivot = Builder(name = "TablePivot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.955f, 14.0f)
                horizontalLineToRelative(-1.955f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.0f)
                lineToRelative(-2.715f, -2.792f)
                curveToRelative(-0.38f, -0.391f, -0.38f, -1.025f, 0.0f, -1.416f)
                lineToRelative(2.715f, -2.792f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.955f)
                lineToRelative(2.756f, -2.711f)
                curveToRelative(0.386f, -0.386f, 1.012f, -0.386f, 1.398f, 0.0f)
                lineToRelative(2.756f, 2.711f)
                close()
                moveTo(20.5f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.033f)
                curveToRelative(0.647f, 0.074f, 1.276f, 0.345f, 1.771f, 0.839f)
                lineToRelative(1.229f, 1.208f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(11.212f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(12.0f)
                lineTo(13.371f, 22.0f)
                lineToRelative(-1.36f, -1.398f)
                curveToRelative(-0.44f, -0.452f, -0.702f, -1.015f, -0.799f, -1.602f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(-1.5f)
                curveTo(1.57f, 2.0f, 0.0f, 3.57f, 0.0f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 2.0f)
                close()
            }
        }
        .build()
        return _tablePivot!!
    }

private var _tablePivot: ImageVector? = null
