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

public val Icons.Bold.ComplianceDocument: ImageVector
    get() {
        if (_complianceDocument != null) {
            return _complianceDocument!!
        }
        _complianceDocument = Builder(name = "ComplianceDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.363f, 11.758f)
                lineToRelative(-3.863f, -1.28f)
                lineToRelative(-3.865f, 1.28f)
                curveToRelative(-0.978f, 0.325f, -1.635f, 1.236f, -1.635f, 2.266f)
                verticalLineToRelative(3.477f)
                curveToRelative(0.0f, 3.522f, 3.561f, 5.576f, 4.648f, 6.12f)
                lineToRelative(0.786f, 0.396f)
                lineToRelative(0.812f, -0.329f)
                curveToRelative(1.115f, -0.448f, 4.754f, -2.218f, 4.754f, -6.187f)
                verticalLineToRelative(-3.477f)
                curveToRelative(0.0f, -1.029f, -0.657f, -1.94f, -1.637f, -2.266f)
                close()
                moveTo(21.0f, 17.5f)
                curveToRelative(0.0f, 1.743f, -1.535f, 2.76f, -2.436f, 3.206f)
                curveToRelative(-0.876f, -0.508f, -2.564f, -1.686f, -2.564f, -3.206f)
                verticalLineToRelative(-3.033f)
                lineToRelative(2.5f, -0.829f)
                lineToRelative(2.5f, 0.829f)
                verticalLineToRelative(3.033f)
                close()
                moveTo(14.546f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.664f)
                verticalLineToRelative(2.336f)
                horizontalLineToRelative(-8.0f)
                lineTo(12.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(8.92f)
                curveToRelative(0.698f, 1.267f, 1.688f, 2.264f, 2.626f, 3.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.134f, 13.0f)
                horizontalLineToRelative(-6.134f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.674f)
                curveToRelative(-1.289f, 0.549f, -2.219f, 1.664f, -2.54f, 3.0f)
                close()
            }
        }
        .build()
        return _complianceDocument!!
    }

private var _complianceDocument: ImageVector? = null
