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

public val Icons.Filled.CloudShowers: ImageVector
    get() {
        if (_cloudShowers != null) {
            return _cloudShowers!!
        }
        _cloudShowers = Builder(name = "CloudShowers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(11.0f, 21.0f)
                lineTo(11.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(7.0f, 23.0f)
                lineTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(19.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(17.918f, 5.133f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, true, -0.687f, -0.557f)
                curveTo(13.125f, -3.731f, 0.494f, 0.19f, 2.146f, 9.528f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, -0.315f, 0.873f)
                arcToRelative(5.552f, 5.552f, 0.0f, false, false, 0.218f, 8.372f)
                arcTo(0.593f, 0.593f, 0.0f, false, false, 3.0f, 18.189f)
                arcTo(3.056f, 3.056f, 0.0f, false, true, 7.116f, 15.22f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 5.768f, 0.0f)
                arcToRelative(2.972f, 2.972f, 0.0f, false, true, 2.232f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.884f, 0.9f)
                verticalLineToRelative(1.215f)
                arcToRelative(0.521f, 0.521f, 0.0f, false, false, 0.886f, 0.371f)
                curveTo(25.838f, 13.831f, 24.046f, 6.223f, 17.918f, 5.133f)
                close()
            }
        }
        .build()
        return _cloudShowers!!
    }

private var _cloudShowers: ImageVector? = null
