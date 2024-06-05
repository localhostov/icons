package me.localx.icons.straight.filled

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

public val Icons.Filled.FileEps: ImageVector
    get() {
        if (_fileEps != null) {
            return _fileEps!!
        }
        _fileEps = Builder(name = "FileEps", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.414f)
                lineToRelative(4.414f, -4.414f)
                lineToRelative(-4.414f, 0.0f)
                lineToRelative(0.0f, 4.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(7.261f, 6.246f)
                lineTo(5.248f, 6.246f)
                lineTo(5.248f, 7.384f)
                lineTo(7.112f, 7.384f)
                verticalLineToRelative(1.25f)
                lineTo(5.248f, 8.634f)
                lineTo(5.248f, 9.771f)
                lineTo(7.261f, 9.771f)
                verticalLineToRelative(1.25f)
                lineTo(4.0f, 11.021f)
                lineTo(4.0f, 5.0f)
                lineTo(7.261f, 5.0f)
                close()
                moveTo(10.984f, 8.966f)
                lineTo(10.267f, 8.966f)
                verticalLineToRelative(2.1f)
                lineTo(9.017f, 11.066f)
                lineTo(9.017f, 5.0f)
                horizontalLineToRelative(1.967f)
                arcToRelative(1.985f, 1.985f, 0.0f, true, true, 0.0f, 3.97f)
                close()
                moveTo(15.419f, 6.941f)
                curveToRelative(0.016f, 0.0f, 0.614f, 0.263f, 1.273f, 0.507f)
                arcTo(1.827f, 1.827f, 0.0f, false, true, 18.1f, 9.461f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.04f, 1.552f)
                arcToRelative(2.869f, 2.869f, 0.0f, false, true, -2.13f, -0.914f)
                lineToRelative(-0.42f, -0.462f)
                lineToRelative(0.926f, -0.841f)
                lineToRelative(0.42f, 0.463f)
                arcToRelative(1.637f, 1.637f, 0.0f, false, false, 1.2f, 0.5f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 0.809f, -0.521f)
                curveToRelative(0.062f, -0.345f, -0.451f, -0.563f, -0.61f, -0.622f)
                curveToRelative(-0.752f, -0.277f, -1.43f, -0.58f, -1.43f, -0.58f)
                arcToRelative(1.572f, 1.572f, 0.0f, false, true, -0.777f, -1.579f)
                arcToRelative(1.711f, 1.711f, 0.0f, false, true, 1.239f, -1.38f)
                arcToRelative(2.813f, 2.813f, 0.0f, false, true, 2.452f, 0.537f)
                lineToRelative(0.479f, 0.4f)
                lineToRelative(-0.8f, 0.956f)
                lineToRelative(-0.475f, -0.4f)
                arcToRelative(1.567f, 1.567f, 0.0f, false, false, -1.29f, -0.3f)
                arcToRelative(0.457f, 0.457f, 0.0f, false, false, -0.363f, 0.361f)
                arcTo(0.3f, 0.3f, 0.0f, false, false, 15.419f, 6.941f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.984f, 6.246f)
                horizontalLineToRelative(-0.715f)
                lineToRelative(0.0f, 1.473f)
                lineToRelative(0.71f, 0.0f)
                arcToRelative(0.735f, 0.735f, 0.0f, true, false, 0.0f, -1.47f)
                close()
            }
        }
        .build()
        return _fileEps!!
    }

private var _fileEps: ImageVector? = null
