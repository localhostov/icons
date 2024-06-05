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

public val Icons.Bold.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.644f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.089f)
                lineTo(15.077f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.285f, -1.261f, -6.153f, 0.0f)
                lineTo(2.423f, 5.327f)
                curveTo(0.906f, 6.352f, 0.0f, 8.056f, 0.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(10.0f, 14.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 9.886f)
                curveToRelative(0.0f, -1.653f, -0.739f, -3.202f, -2.0f, -4.242f)
                close()
                moveTo(5.5f, 21.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(3.95f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(7.0f, 14.5f)
                verticalLineToRelative(1.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.036f, 14.0f)
                curveToRelative(-0.023f, 0.163f, -0.036f, 0.33f, -0.036f, 0.5f)
                close()
                moveTo(3.0f, 11.0f)
                verticalLineToRelative(-1.114f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.606f, 1.102f, -2.072f)
                lineTo(10.602f, 3.428f)
                curveToRelative(0.85f, -0.574f, 1.947f, -0.574f, 2.796f, 0.0f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(0.69f, 0.466f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(1.114f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(21.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.17f, -0.012f, -0.337f, -0.036f, -0.5f)
                horizontalLineToRelative(4.036f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.95f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.45f, 2.0f)
                close()
                moveTo(13.5f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
