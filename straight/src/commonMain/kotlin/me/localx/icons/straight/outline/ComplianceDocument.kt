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

public val Icons.Outline.ComplianceDocument: ImageVector
    get() {
        if (_complianceDocument != null) {
            return _complianceDocument!!
        }
        _complianceDocument = Builder(name = "ComplianceDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 17.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 13.625f)
                verticalLineToRelative(3.911f)
                curveToRelative(0.0f, 4.03f, -3.764f, 5.858f, -4.917f, 6.322f)
                lineToRelative(-0.629f, 0.253f)
                lineToRelative(-0.604f, -0.306f)
                curveToRelative(-1.135f, -0.566f, -4.85f, -2.699f, -4.85f, -6.27f)
                verticalLineToRelative(-3.911f)
                curveToRelative(0.0f, -0.862f, 0.551f, -1.625f, 1.37f, -1.896f)
                lineToRelative(4.13f, -1.369f)
                lineToRelative(4.13f, 1.369f)
                curveToRelative(0.819f, 0.271f, 1.37f, 1.034f, 1.37f, 1.896f)
                close()
                moveTo(22.0f, 13.625f)
                lineToRelative(-3.5f, -1.158f)
                lineToRelative(-3.501f, 1.16f)
                verticalLineToRelative(3.909f)
                curveToRelative(0.0f, 2.281f, 2.633f, 3.889f, 3.547f, 4.379f)
                curveToRelative(1.031f, -0.455f, 3.454f, -1.798f, 3.454f, -4.379f)
                verticalLineToRelative(-3.911f)
                close()
                moveTo(14.479f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(9.414f)
                lineToRelative(7.586f, 7.586f)
                verticalLineToRelative(1.414f)
                horizontalLineToRelative(-9.0f)
                lineTo(11.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(10.535f)
                curveToRelative(0.586f, 0.793f, 1.274f, 1.459f, 1.944f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                verticalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _complianceDocument!!
    }

private var _complianceDocument: ImageVector? = null
