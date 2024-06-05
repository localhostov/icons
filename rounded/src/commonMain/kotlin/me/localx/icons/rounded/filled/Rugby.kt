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

public val Icons.Filled.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 23.912f)
                curveToRelative(-0.449f, 0.04f, -0.9f, 0.068f, -1.331f, 0.068f)
                arcToRelative(8.106f, 8.106f, 0.0f, false, true, -5.769f, -1.88f)
                curveToRelative(-1.518f, -1.522f, -2.074f, -4.191f, -1.817f, -7.1f)
                close()
                moveTo(23.945f, 8.531f)
                curveToRelative(0.155f, -2.725f, -0.41f, -5.192f, -1.845f, -6.631f)
                reflectiveCurveToRelative(-3.9f, -2.0f, -6.629f, -1.847f)
                close()
                moveTo(23.609f, 11.023f)
                arcToRelative(16.888f, 16.888f, 0.0f, false, true, -4.261f, 8.325f)
                arcToRelative(16.742f, 16.742f, 0.0f, false, true, -7.923f, 4.163f)
                lineToRelative(-10.95f, -10.95f)
                arcToRelative(16.771f, 16.771f, 0.0f, false, true, 4.177f, -7.909f)
                arcToRelative(16.888f, 16.888f, 0.0f, false, true, 8.325f, -4.261f)
                close()
                moveTo(17.709f, 10.293f)
                lineTo(13.709f, 6.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(1.291f, 1.293f)
                lineToRelative(-1.586f, 1.586f)
                lineToRelative(-1.293f, -1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.586f, 1.586f)
                lineToRelative(-1.293f, -1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
