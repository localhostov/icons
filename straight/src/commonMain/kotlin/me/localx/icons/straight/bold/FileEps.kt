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

public val Icons.Bold.FileEps: ImageVector
    get() {
        if (_fileEps != null) {
            return _fileEps!!
        }
        _fileEps = Builder(name = "FileEps", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.984f, 5.716f)
                arcToRelative(0.735f, 0.735f, 0.0f, true, false, 0.0f, -1.47f)
                horizontalLineToRelative(-0.715f)
                lineToRelative(0.0f, 1.473f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.471f)
                lineTo(24.0f, 17.471f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(16.259f, 6.62f)
                curveToRelative(-0.752f, -0.277f, -1.43f, -0.58f, -1.43f, -0.58f)
                arcToRelative(1.572f, 1.572f, 0.0f, false, true, -0.777f, -1.579f)
                arcToRelative(1.711f, 1.711f, 0.0f, false, true, 1.239f, -1.38f)
                arcToRelative(2.813f, 2.813f, 0.0f, false, true, 2.452f, 0.537f)
                lineToRelative(0.479f, 0.4f)
                lineToRelative(-0.8f, 0.956f)
                lineToRelative(-0.475f, -0.4f)
                arcToRelative(1.567f, 1.567f, 0.0f, false, false, -1.29f, -0.3f)
                arcToRelative(0.457f, 0.457f, 0.0f, false, false, -0.363f, 0.361f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.13f, 0.3f)
                curveToRelative(0.016f, 0.0f, 0.614f, 0.263f, 1.273f, 0.507f)
                arcTo(1.827f, 1.827f, 0.0f, false, true, 18.1f, 7.461f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.04f, 1.552f)
                arcTo(2.869f, 2.869f, 0.0f, false, true, 13.93f, 8.1f)
                lineToRelative(-0.42f, -0.462f)
                lineToRelative(0.926f, -0.841f)
                lineToRelative(0.42f, 0.463f)
                arcToRelative(1.637f, 1.637f, 0.0f, false, false, 1.2f, 0.5f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 0.809f, -0.521f)
                curveTo(16.931f, 6.9f, 16.418f, 6.679f, 16.259f, 6.62f)
                close()
                moveTo(9.017f, 3.0f)
                horizontalLineToRelative(1.967f)
                arcToRelative(1.985f, 1.985f, 0.0f, true, true, 0.0f, 3.97f)
                lineToRelative(-0.717f, 0.0f)
                verticalLineToRelative(2.1f)
                horizontalLineTo(9.017f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(7.261f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(5.248f)
                verticalLineTo(5.384f)
                horizontalLineTo(7.112f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(5.248f)
                verticalLineTo(7.771f)
                horizontalLineTo(7.261f)
                verticalLineToRelative(1.25f)
                horizontalLineTo(4.0f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _fileEps!!
    }

private var _fileEps: ImageVector? = null
