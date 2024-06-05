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

public val Icons.Filled.ComplianceClipboard: ImageVector
    get() {
        if (_complianceClipboard != null) {
            return _complianceClipboard!!
        }
        _complianceClipboard = Builder(name = "ComplianceClipboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.456f, 24.086f)
                lineToRelative(-0.604f, -0.302f)
                curveToRelative(-1.138f, -0.569f, -4.853f, -2.704f, -4.853f, -6.272f)
                verticalLineToRelative(-3.912f)
                curveToRelative(0.0f, -0.862f, 0.55f, -1.624f, 1.37f, -1.896f)
                lineToRelative(4.13f, -1.37f)
                lineToRelative(4.13f, 1.37f)
                curveToRelative(0.819f, 0.271f, 1.37f, 1.033f, 1.37f, 1.896f)
                verticalLineToRelative(3.912f)
                curveToRelative(0.0f, 4.031f, -3.763f, 5.858f, -4.917f, 6.322f)
                lineToRelative(-0.627f, 0.252f)
                close()
                moveTo(11.0f, 17.512f)
                verticalLineToRelative(-0.513f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.399f)
                curveToRelative(0.0f, -0.218f, 0.018f, -0.433f, 0.052f, -0.642f)
                lineToRelative(-0.052f, 0.041f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.962f)
                curveToRelative(0.462f, -0.539f, 1.07f, -0.957f, 1.778f, -1.192f)
                lineToRelative(4.26f, -1.413f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-5.171f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(11.51f)
                curveToRelative(-1.692f, -1.358f, -3.51f, -3.511f, -3.51f, -6.487f)
                close()
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _complianceClipboard!!
    }

private var _complianceClipboard: ImageVector? = null
