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

public val Icons.Filled.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 15.07f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.45f, -0.36f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.14f, 0.0f, -0.43f, 0.0f, -0.75f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.32f, 0.0f, 0.61f, 0.0f, 0.75f, 0.0f)
                curveToRelative(0.39f, 0.0f, 0.75f, 0.3f, 0.75f, 0.75f)
                close()
                moveTo(6.97f, 14.25f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(1.47f)
                reflectiveCurveToRelative(0.71f, 0.0f, 0.71f, 0.0f)
                curveToRelative(0.41f, 0.0f, 0.76f, -0.34f, 0.76f, -0.73f)
                reflectiveCurveToRelative(-0.35f, -0.73f, -0.76f, -0.73f)
                close()
                moveTo(17.0f, 0.59f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(4.41f)
                lineTo(17.0f, 0.59f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.34f, 3.34f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(8.98f, 14.98f)
                curveToRelative(0.0f, -1.09f, -0.9f, -1.98f, -2.01f, -1.98f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(0.72f)
                curveToRelative(1.11f, 0.0f, 2.01f, -0.89f, 2.01f, -1.99f)
                close()
                moveTo(14.0f, 15.05f)
                curveToRelative(0.0f, -1.09f, -0.89f, -1.98f, -2.0f, -1.98f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.0f, -0.75f, 0.0f)
                horizontalLineToRelative(-1.25f)
                reflectiveCurveToRelative(0.0f, 6.0f, 0.0f, 6.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.23f, 0.0f, 0.48f, 0.0f, 0.75f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -1.98f)
                verticalLineToRelative(-2.03f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-1.74f)
                reflectiveCurveToRelative(0.0f, -1.47f, 0.0f, -1.47f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(-1.25f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
