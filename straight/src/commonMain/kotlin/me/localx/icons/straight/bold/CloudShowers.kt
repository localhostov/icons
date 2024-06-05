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

public val Icons.Bold.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                lineTo(11.0f, 24.0f)
                close()
                moveTo(16.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                close()
                moveTo(6.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(24.0f, 12.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.051f, 8.051f, 0.0f, false, true, -3.0f, 6.234f)
                reflectiveCurveToRelative(0.0f, -6.227f, 0.0f, -6.234f)
                horizontalLineToRelative(0.0f)
                arcTo(4.529f, 4.529f, 0.0f, false, false, 16.452f, 8.0f)
                lineTo(15.37f, 7.965f)
                lineToRelative(-0.308f, -1.038f)
                arcToRelative(5.389f, 5.389f, 0.0f, false, false, -4.971f, -3.9f)
                arcTo(4.935f, 4.935f, 0.0f, false, false, 5.0f, 8.026f)
                arcToRelative(5.926f, 5.926f, 0.0f, false, false, 0.247f, 2.025f)
                lineToRelative(0.479f, 1.259f)
                lineToRelative(-1.2f, 0.611f)
                arcTo(2.784f, 2.784f, 0.0f, false, false, 3.0f, 14.412f)
                arcToRelative(3.211f, 3.211f, 0.0f, false, false, 1.0f, 2.329f)
                verticalLineToRelative(3.42f)
                arcToRelative(6.171f, 6.171f, 0.0f, false, true, -4.0f, -5.749f)
                lineTo(0.0f, 14.4f)
                arcTo(5.768f, 5.768f, 0.0f, false, true, 2.133f, 9.918f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 2.0f, 8.026f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 8.091f, -8.0f)
                arcTo(8.288f, 8.288f, 0.0f, false, true, 17.585f, 5.1f)
                arcTo(7.529f, 7.529f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(0.005f, 14.412f)
                lineTo(0.0f, 14.412f)
                curveTo(0.0f, 14.422f, 0.0f, 14.431f, 0.005f, 14.412f)
                close()
                moveTo(2.999f, 14.412f)
                lineTo(3.0f, 14.412f)
                curveTo(3.0f, 14.431f, 3.0f, 14.422f, 3.0f, 14.412f)
                close()
                moveTo(23.999f, 12.506f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
