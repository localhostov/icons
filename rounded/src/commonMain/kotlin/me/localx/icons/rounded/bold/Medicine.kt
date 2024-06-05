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

public val Icons.Bold.Medicine: ImageVector
    get() {
        if (_medicine != null) {
            return _medicine!!
        }
        _medicine = Builder(name = "Medicine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.522f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.017f, 0.0f, -0.033f, -0.005f, -0.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.495f, 4.95f)
                curveTo(8.0f, 4.967f, 8.0f, 4.983f, 8.0f, 5.0f)
                verticalLineTo(6.522f)
                arcTo(5.508f, 5.508f, 0.0f, false, false, 3.0f, 12.0f)
                verticalLineToRelative(6.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(12.0f)
                arcTo(5.508f, 5.508f, 0.0f, false, false, 16.0f, 6.522f)
                close()
                moveTo(18.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 18.5f)
                verticalLineTo(12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 9.5f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 12.0f)
                close()
                moveTo(16.0f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _medicine!!
    }

private var _medicine: ImageVector? = null
