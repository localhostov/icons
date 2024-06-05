package me.localx.icons.straight.outline

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

public val Icons.Outline.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(22.0f, 4.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.529f)
                lineToRelative(-2.0f, 1.0f)
                verticalLineToRelative(2.529f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.529f)
                lineToRelative(-3.943f, -1.971f)
                lineTo(10.276f, 0.392f)
                curveToRelative(1.047f, -0.521f, 2.399f, -0.522f, 3.446f, 0.0f)
                lineToRelative(8.278f, 4.109f)
                close()
                moveTo(6.53f, 4.5f)
                lineToRelative(4.641f, 2.32f)
                curveToRelative(0.48f, 0.24f, 1.177f, 0.24f, 1.658f, 0.0f)
                lineToRelative(4.641f, -2.32f)
                lineToRelative(-4.641f, -2.32f)
                curveToRelative(-0.479f, -0.239f, -1.179f, -0.24f, -1.659f, 0.0f)
                lineToRelative(-4.64f, 2.319f)
                close()
                moveTo(16.0f, 7.471f)
                lineToRelative(-2.276f, 1.138f)
                curveToRelative(-0.523f, 0.262f, -1.124f, 0.393f, -1.724f, 0.393f)
                reflectiveCurveToRelative(-1.2f, -0.131f, -1.724f, -0.393f)
                lineToRelative(-2.276f, -1.138f)
                verticalLineToRelative(1.529f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.529f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
