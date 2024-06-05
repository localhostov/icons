package me.localx.icons.straight.filled

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

public val Icons.Filled.Jpg: ImageVector
    get() {
        if (_jpg != null) {
            return _jpg!!
        }
        _jpg = Builder(name = "Jpg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                close()
                moveTo(10.967f, 6.25f)
                horizontalLineToRelative(-0.715f)
                verticalLineToRelative(1.473f)
                horizontalLineToRelative(0.71f)
                arcToRelative(0.735f, 0.735f, 0.0f, true, false, 0.0f, -1.47f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(4.068f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.75f, 0.751f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.75f, -0.735f)
                curveToRelative(0.0f, -0.03f, 0.0f, -0.084f, 0.0f, -0.084f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(0.084f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 1.984f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.0f, -1.984f)
                close()
                moveTo(12.979f, 6.985f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.012f, -1.985f)
                horizontalLineToRelative(-1.967f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(0.717f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.012f, -1.984f)
                close()
                moveTo(15.251f, 9.068f)
                verticalLineToRelative(-2.068f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, 0.749f, -0.75f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, true, 0.75f, 0.75f)
                horizontalLineToRelative(1.25f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -2.0f, -2.0f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, -2.0f, 1.985f)
                verticalLineToRelative(2.1f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.0f, 1.985f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.984f)
                verticalLineToRelative(-1.086f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.749f)
                verticalLineToRelative(0.084f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.75f, 0.735f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.748f, -0.751f)
                close()
            }
        }
        .build()
        return _jpg!!
    }

private var _jpg: ImageVector? = null
