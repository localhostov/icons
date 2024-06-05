package me.localx.icons.rounded.outline

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

public val Icons.Outline.AsseptDocument: ImageVector
    get() {
        if (_asseptDocument != null) {
            return _asseptDocument!!
        }
        _asseptDocument = Builder(name = "AsseptDocument", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.95f, 5.536f)
                lineToRelative(-3.486f, -3.486f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, -4.949f, -2.05f)
                horizontalLineToRelative(-4.515f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                arcToRelative(6.954f, 6.954f, 0.0f, false, false, -2.05f, -4.949f)
                close()
                moveTo(18.536f, 6.95f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, true, 0.781f, 1.05f)
                horizontalLineToRelative(-4.317f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.317f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, true, 1.05f, 0.781f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.165f, 0.0f, 0.323f, 0.032f, 0.485f, 0.047f)
                verticalLineToRelative(4.953f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.953f)
                curveToRelative(0.015f, 0.162f, 0.047f, 0.32f, 0.047f, 0.485f)
                close()
                moveTo(16.724f, 13.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.035f, 1.413f)
                lineToRelative(-3.589f, 3.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.226f, -0.017f)
                lineToRelative(-1.54f, -1.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.494f)
                lineToRelative(1.585f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.456f, 0.04f)
                lineToRelative(3.6f, -3.431f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.417f, 0.035f)
                close()
            }
        }
        .build()
        return _asseptDocument!!
    }

private var _asseptDocument: ImageVector? = null
