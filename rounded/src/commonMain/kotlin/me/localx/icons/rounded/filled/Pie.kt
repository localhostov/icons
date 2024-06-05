package me.localx.icons.rounded.filled

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

public val Icons.Filled.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = Builder(name = "Pie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3f, 20.0f)
                arcToRelative(4.527f, 4.527f, 0.0f, false, true, -4.482f, 4.0f)
                lineTo(7.178f, 24.0f)
                arcTo(4.527f, 4.527f, 0.0f, false, true, 2.7f, 20.0f)
                arcToRelative(6.021f, 6.021f, 0.0f, false, false, 6.3f, 0.2f)
                arcToRelative(6.159f, 6.159f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(6.018f, 6.018f, 0.0f, false, false, 21.3f, 20.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 3.0f)
                close()
                moveTo(17.0f, 3.0f)
                lineTo(17.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(15.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 3.0f)
                close()
                moveTo(9.0f, 3.0f)
                lineTo(9.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.0f)
                lineTo(7.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.0f)
                close()
                moveTo(24.0f, 14.0f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, true, -2.513f, 2.949f)
                arcToRelative(4.027f, 4.027f, 0.0f, false, true, -6.487f, 0.7f)
                arcToRelative(4.038f, 4.038f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, -6.488f, -0.7f)
                arcTo(2.918f, 2.918f, 0.0f, false, true, 0.0f, 14.0f)
                curveToRelative(0.0f, -3.624f, 5.353f, -8.0f, 12.0f, -8.0f)
                reflectiveCurveTo(24.0f, 10.376f, 24.0f, 14.0f)
                close()
                moveTo(10.985f, 9.65f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.635f, -0.635f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.967f, 0.752f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, false, 1.85f, 1.85f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 10.985f, 9.65f)
                close()
                moveTo(15.617f, 9.767f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.967f, -0.752f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.635f, 0.635f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, 0.752f, 1.967f)
                arcTo(1.308f, 1.308f, 0.0f, false, false, 15.617f, 9.767f)
                close()
            }
        }
        .build()
        return _pie!!
    }

private var _pie: ImageVector? = null
