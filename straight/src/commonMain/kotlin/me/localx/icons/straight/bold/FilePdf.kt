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

public val Icons.Bold.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.38f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 5.66f)
                lineTo(16.38f, 0.0f)
                close()
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(1.97f)
                curveToRelative(1.11f, 0.0f, 2.01f, 0.89f, 2.01f, 1.98f)
                reflectiveCurveToRelative(-0.9f, 1.98f, -2.01f, 1.98f)
                horizontalLineToRelative(-0.72f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(14.0f, 19.02f)
                curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -2.0f, 1.98f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.0f, -0.75f, 0.0f)
                horizontalLineToRelative(-1.25f)
                reflectiveCurveToRelative(0.0f, -6.0f, 0.0f, -6.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.23f, 0.0f, 0.48f, 0.0f, 0.75f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 1.98f)
                verticalLineToRelative(2.03f)
                close()
                moveTo(19.0f, 16.25f)
                horizontalLineToRelative(-2.75f)
                verticalLineToRelative(1.47f)
                reflectiveCurveToRelative(1.75f, 0.0f, 1.75f, 0.0f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(12.75f, 17.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.45f, -0.36f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.14f, 0.0f, -0.43f, 0.0f, -0.75f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.32f, 0.0f, 0.61f, 0.0f, 0.75f, 0.0f)
                curveToRelative(0.39f, 0.0f, 0.75f, 0.3f, 0.75f, 0.75f)
                close()
                moveTo(6.26f, 17.72f)
                verticalLineToRelative(-1.47f)
                reflectiveCurveToRelative(0.71f, 0.0f, 0.71f, 0.0f)
                curveToRelative(0.41f, 0.0f, 0.76f, 0.34f, 0.76f, 0.73f)
                reflectiveCurveToRelative(-0.35f, 0.73f, -0.76f, 0.73f)
                horizontalLineToRelative(-0.71f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
