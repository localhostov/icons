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

public val Icons.Filled.ComplianceDocument: ImageVector
    get() {
        if (_complianceDocument != null) {
            return _complianceDocument!!
        }
        _complianceDocument = Builder(name = "ComplianceDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.454f, 24.111f)
                lineToRelative(-0.604f, -0.306f)
                curveToRelative(-1.135f, -0.566f, -4.85f, -2.699f, -4.85f, -6.27f)
                verticalLineToRelative(-3.536f)
                curveToRelative(0.0f, -0.862f, 0.551f, -1.625f, 1.37f, -1.896f)
                lineToRelative(4.13f, -1.369f)
                lineToRelative(4.13f, 1.369f)
                curveToRelative(0.819f, 0.271f, 1.37f, 1.034f, 1.37f, 1.896f)
                verticalLineToRelative(3.536f)
                curveToRelative(0.0f, 4.03f, -3.764f, 5.858f, -4.917f, 6.322f)
                lineToRelative(-0.629f, 0.253f)
                close()
                moveTo(15.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(15.0f, 0.586f)
                close()
                moveTo(11.44f, 20.0f)
                horizontalLineToRelative(-6.44f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.015f)
                curveToRelative(-0.01f, -0.152f, -0.015f, -0.307f, -0.015f, -0.464f)
                verticalLineToRelative(-1.536f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, -1.727f, 1.102f, -3.252f, 2.741f, -3.795f)
                lineToRelative(4.759f, -1.578f)
                lineToRelative(1.5f, 0.497f)
                verticalLineToRelative(-2.124f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(14.478f)
                curveToRelative(-1.173f, -0.947f, -2.402f, -2.277f, -3.038f, -4.0f)
                close()
            }
        }
        .build()
        return _complianceDocument!!
    }

private var _complianceDocument: ImageVector? = null
